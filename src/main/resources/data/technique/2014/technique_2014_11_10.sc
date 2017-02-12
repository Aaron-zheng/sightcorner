Architecture models: UML notation, Use case diagrams, Interaction diagrams, Activity diagrams, and Class diagrams.

Three leading OO notations decide to combine:
1. Grady Booch (BOOCH)
2. Jim rumbaugh (OMT: Object modeling technique)
3. Ivar Jacobsen (OOSE: OO Soft. Eng)

UML notation
1. UML: Unified modeling language
2. Design by committee
3. Resulting design is robust
4. uml notation examples: use case diagram, sequence diagram, class diagram, activity diagram

Use Case Modeling
1. Use cases define the requirements as sequences of actions from the end user's point of view.
2. User cases are used to elaborate the behaviour of a system, from the functional requirements, during the inception and elaboration phase. However, use case are often added throughout the development process.
3. To determine the system goal, first discover the actor, find out what the system does to the actor.
4. The collection of the actors and use cases represent the use case model.

Use Case Modeling steps
1. Capture the scope of the system
2. Find the primary actors 
3. Capture their goals
4. Find use cases

Use case notation
1. A use case is denoted by an ellipse containing the name of the use case.

Use case relationships
1. Association
2. Demonstrates an association between a particular actor and use case

Use case diagram
1. Describes what the new system should do and what the existing system already does
2. Show the relationship between the actors and the use case among within the systems.
2014_11_10_p1

Interaction diagrams
1. Interaction diagram model the dynamic aspects of a system
2. A deliverable for uee case realization
3. They commonly contain: Objects, Links, and Messages
4. Two types of interaction diagrams: Collaboration diagram, and Sequence diagram

To draw a sequence diagram
1. Place the controlling and collaborating object across the top
2. Draw the lifeline for the each object vertically
3. Starting at the top, show messages being passed between participants
2014_11_10_p2

Message notation
1. Two types of messages. Synchronous: Represented by a line with a solid triangle arrowhead. Asynchronous: Represented by a line with an open arrowhead.
2. Message return: Represented by a dashed arrow or half arrow. 

Activity diagrams
1. Two definitions: A task that needs to be done. A method or a class.
2. Activity agreement: Sequential, one activity is followed by another. Parallel, two or more sets of activities are performed concurrently.
3. Used to describe complicated methods or use cases. To use, start with a coarse-grained use case. Activity diagrams are better than flow charts.

Activity diagram: uml notation
1. Start at the top blank circle
2. If condition 1 is true, go right; If condition 2 is true, go down
3. At first bar(synchronization bar), break apart to follow 2 parallel paths
4. At second bar, come together to proceed only when both parallel activities are done
2014_11_10_p3

Class Notation in UML
1. Drawn as a solid-outline rectangle with three compartments seperated by horizontal lines

Class diagram
1. Describes objects in the system
2. Describes relationships between objects
3. Two static relationship: Association, and Subtype
4. Shows: attributes and operations, and constraints

Multiplicity
1. Define the number os objects that participate in the relationship
2. The UML term for cardinality
3. The common multiplicity indicators are: 1, exactly one; *, zeo to many; 1..*, one or many;

Composition
1. A part-whole relationship
2. The part object may belong to only one whole object; the parts are usually expected live or die with the whole object.
3. Multiplicity of the whole object side of the class diagram must be 1
4. Symbolized by a solid diamond
5. Composition is a more complete form of aggregation


Notes and key concepts
1. UML is an international standard composed of multiple modeling languages that existed before
2. UML has wide applicability
3. Use Cases and use case diagrams represent the scope of a system very succinctly and precisely
4. Sequence diagrams are useful to represent dynamic interactions between components, classes, use cases, etc
5. Activity diagrams are better than flow chats to represent parallel flows of events
6. Class diagram present concepts in a system, along with relationships and potentially detailed information about attributes, operations, multiplicity, and other details.


