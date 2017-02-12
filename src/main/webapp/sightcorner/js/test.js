var game = new Phaser.Game(400, 490, Phaser.AUTO, 'gameDiv');

var mainState = {

  preload: function(){
    game.stage.backgroundColor = '#1e5c7a';
    game.load.image('bird', './sightcorner/test/assets/bird.png');
    game.load.image('pipe', './sightcorner/test/assets/pipe.png');
  },

  create: function(){
	this.score = 0;
	this.labelScore = game.add.text(20, 20, "0", {font:"30px",fill:"#ffffff"});
	  
    game.physics.startSystem(Phaser.Physics.ARCADE);
    this.bird = this.game.add.sprite(20, 245, 'bird');
    this.bird.anchor.setTo(-0.2, 0.5);
    game.physics.arcade.enable(this.bird);
    this.bird.body.gravity.y = 300;
    
    this.pipes = game.add.group();
    this.pipes.enableBody = true;
    this.pipes.createMultiple(200, 'pipe');
    
    this.timer = game.time.events.loop(2000, this.addRowOfPipes, this);
    
    game.input.onDown.add(this.jump, this);
  },
  
  addOnePipe: function(x, y){
	var pipe = this.pipes.getFirstDead();
	pipe.reset(x, y);
	pipe.body.velocity.x = -200;
	pipe.checkWorldBounds = true;
	pipe.outOfBoundsKill = true;
  },
  
  addRowOfPipes: function(){
	this.score += 1;
	this.labelScore.text = this.score;
	var hold = Math.floor(Math.random() * 5) + 1;
	
	for(var i = 0; i < 7; i++){
		if(i != hold && i != hold + 1){
			this.addOnePipe(400, i * 60 + 10);
		}
	}
  },
  
  jump: function(){
	this.bird.body.velocity.y = -250;
	var animation = game.add.tween(this.bird);
	animation.to({angle:-20}, 1000);
	animation.start();
//	this.bird.angle = -20;
  },
  
  restartGame: function(){
	  game.state.start('main');
  },

  update: function(){
	  if(false == this.bird.inWorld){
		  this.restartGame();
	  }
	  this.bird.angle += 1;
	  game.physics.arcade.overlap(this.bird, this.pipes, this.hitPipe, null, this);
  },
  
  hitPipe: function(){
	  if(false == this.bird.alive){
		  return;
	  }
	  this.bird.alive = false;
	  game.time.events.remove(this.timer);
	  this.pipes.forEachAlive(function(p){
		  p.body.velocity.x = 0;
	  }, this);
	  this.bird.body.velocity.x = 0;
	  this.bird.body.velocity.y = 0;
	  this.bird.body.gravity.x = 0;
	  this.bird.body.gravity.y = 0;
  }

};

game.state.add('main', mainState);
game.state.start('main');