最近在看内部文档的 "How can you get started with machine learning" 的时候，看到了 TensorFlow。于是就想去接触一下。
因为据说这个是可以没有机器学习经验的同学都可以去用的。于是跟着Codelab - goo.gl/xGsB9d 跑了一次，算是初体验吧。
在 Mac 下，先安装 Docker，这里有2种模式，一种是 Docker Toolbox，另外一种是 Docker for Mac。两种软件是可以并存的，但是看了解释，发现 Docker for Mac 属于 Mac 下的原生 App，所以最后只选择下载后者。
<pre>https://docs.docker.com/docker-for-mac/</pre>

安装完启动后，在命令台输入 docker -v，返回版本号就成功了。
<pre>
Aaron:~ zhengfucheng$ docker -v
Docker version 1.12.0, build 8eab29e
</pre>

接着下载 tensorflow 的镜像。docker run -it gcr.io/tensorflow/tensorflow:latest-devel 运行成功的话，应该会看见到弹出类似 root@xx 的命令行 
<pre>
Aaron:~ zhengfucheng$ docker run -it gcr.io/tensorflow/tensorflow:latest-devel
root@b05bbfc39ba7:~# 
</pre>

开始我们的 hello world 程序了。
<pre>
root@b05bbfc39ba7:~# python
Python 2.7.6 (default, Jun 22 2015, 17:58:13) 
[GCC 4.8.2] on linux2
Type "help", "copyright", "credits" or "license" for more information.
>>> import tensorflow as tf
>>> hello = tf.constant('Hello, TensorFlow!')
>>> sess = tf.Session()
>>> print(sess.run(hello))
Hello, TensorFlow!
</pre>

现在才是正式开始接触 TensorFlow，之前的都是配置。首先先下载我们将准备用来训练的图片素材，然后解压。
<pre>
curl -O http://download.tensorflow.org/example_images/flower_photos.tgz
tar xzf flower_photos.tgz
</pre>

开启 docker 运行我们的 tensorflow 了。
<pre>
Aaron:poets zhengfucheng$ docker run -it -v /Users/zhengfucheng/Documents/tensorflow_workspace/poets:/tf_files gcr.io/tensorflow/tensorflow:latest-devel
root@10a12e654dc0:~# cd /tensorflow
root@10a12e654dc0:/tensorflow# git pull
remote: Counting objects: 44150, done.
remote: Total 44150 (delta 9249), reused 9249 (delta 9249), pack-reused 34901
Receiving objects: 100% (44150/44150), 22.00 MiB | 1.50 MiB/s, done.
Resolving deltas: 100% (33248/33248), completed with 2213 local objects.
From https://github.com/tensorflow/tensorflow
   dc19800..9b69ec3  r0.8       -> origin/r0.8
 * [new branch]      go         -> origin/go
 * [new branch]      issue_template_update -> origin/issue_template_update
   6aedb0b..8cb0558  master     -> origin/master
 * [new branch]      mrry-patch-1 -> origin/mrry-patch-1
 * [new branch]      r0.10      -> origin/r0.10
 * [new branch]      r0.9       -> origin/r0.9
 * [new branch]      revert-3010-issue-2977 -> origin/revert-3010-issue-2977
 * [new branch]      revert-3614-satok0 -> origin/revert-3614-satok0
 * [new branch]      tflearn-tutorial-updates -> origin/tflearn-tutorial-updates
 * [new branch]      tutorial-url-fix -> origin/tutorial-url-fix
 * [new branch]      vincentvanhoucke-patch-1 -> origin/vincentvanhoucke-patch-1
 * [new branch]      vincentvanhoucke-patch-2 -> origin/vincentvanhoucke-patch-2
 + 55648fc...35d2eea vrv-patch-1 -> origin/vrv-patch-1  (forced update)
 * [new tag]         v0.10.0rc0 -> v0.10.0rc0
 * [new tag]         v0.8.0     -> v0.8.0
 * [new tag]         v0.9.0     -> v0.9.0
 * [new tag]         v0.9.0rc0  -> v0.9.0rc0
Updating dc19800..9b69ec3
Fast-forward
 tensorflow/g3doc/get_started/os_setup.md | 21 ++++++++++++++-------
 1 file changed, 14 insertions(+), 7 deletions(-)
</pre>

官方给出的训练时间大概是30分钟，但因为机器不同，可能会更长。这里有2个地方可以缩减时间的，第1个就是 how_many_training_steps 这里改小点，默认是4000次的。第2个就是训练的图片数，这里一共训练了5种，简单的话，其实训练2种就可以了。
<pre>
root@10a12e654dc0:/tensorflow# python tensorflow/examples/image_retraining/retrain.py \
> --bottleneck_dir=/tf_files/bottlenecks \
> --how_many_training_steps 500 \
> --model_dir=/tf_files/inception \
> --output_graph=/tf_files/retrained_graph.pb \
> --output_labels=/tf_files/retrained_labels.txt \
> --image_dir /tf_files/flower_photos
>> Downloading inception-2015-12-05.tgz 100.0%
Succesfully downloaded inception-2015-12-05.tgz 88931400 bytes.
Looking for images in 'daisy'
Looking for images in 'dandelion'
Looking for images in 'roses'
Looking for images in 'sunflowers'
Looking for images in 'tulips'
</pre>

训练的过程中，首先会生成 Bottlenecks 这个文件块。
<pre>
A 'Bottleneck,' then, is an informal term we often use for the layer just before the final output layer that actually does the classification.
Every image is reused multiple times during training. Calculating the layers behind the bottleneck for each image takes a significant amount of time. By caching the outputs of the lower layers on disk, they don't have to be repeatedly recalculated.

http://www.cs.unc.edu/~wliu/papers/GoogLeNet.pdf
</pre>

然后才开始进行训练，训练过程中，一般会显示有：Train accuracy，Cross entropy，和 Validation accuracy
<pre>
2016-09-03 21:34:18.067157: Step 290: Train accuracy = 94.0%
2016-09-03 21:34:18.067245: Step 290: Cross entropy = 0.175909
2016-09-03 21:34:18.459257: Step 290: Validation accuracy = 90.0%

The training accuracy shows the percentage of the images used in the current training batch that were labeled with the correct class.

Validation accuracy: The validation accuracy is the precision (percentage of correctly-labelled images) on a randomly-selected group of images from a different set.

Cross entropy is a loss function that gives a glimpse into how well the learning process is progressing. (Lower numbers are better here.)


A true measure of the performance of the network is to measure its performance on a data set that is not in the training data. This performance is measured using the validation accuracy. If the training accuracy is high but the validation accuracy remains low, that means the network is overfitting, and the network is memorizing particular features in the training images that don't help it classify images more generally.

The training's objective is to make the cross entropy as small as possible, so you can tell if the learning is working by keeping an eye on whether the loss keeps trending downwards, ignoring the short-term noise.
</pre>

训练完毕后，就可以用训练过的模型，对其它图片进行分类了。可以下载这段 python 代码，来测试图片。
<pre>
Aaron:poets zhengfucheng$ curl -L https://goo.gl/tx3dqg > /Users/zhengfucheng/Documents/tensorflow_workspace/poets/label_image.py
root@758dc276efa3:~# python /tf_files/label_image.py /tf_files/flower_photos/roses/12240303_80d87f77a3_n.jpg
</pre>

最后的结果就会显示，每种分类的自信度。
<pre>
roses (score = 0.86823)
tulips (score = 0.13177)
</pre>
