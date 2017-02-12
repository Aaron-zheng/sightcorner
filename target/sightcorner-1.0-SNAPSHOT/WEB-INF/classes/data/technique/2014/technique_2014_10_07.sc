4+1 view model

Use Case View: 
1. Contains the main use cases and scenarios that illustrate the main flows, significant behaviour, and risks
2. Uses use case and activity diagrams
3. Targets analysts and testers

Logical View: 
1. Contains the architecturally significant aspects of the design model including key subsystems, layers, and classes
2. Uses package, class, and interaction diagrams
3. Targets end users

Implementation View:
1. Describes how the software is implemented including the components and files that are used to assemble and release the physical system.
2. Use component diagrams
3. Targets programmers 

Process View:
1. Show how operating system threads and processes communicate with one another
2. Uses class and interaction diagrams
3. Targets system integrators (Optional view)

Deployment View:
1. Encompasses the nodes that form the system's hardware topology and the allocation of processes and components to the nodes
2. Uses deployment diagrams
3. Targets system engineering


2014_10_07_p0

Use Case View: 
1. Subset of the artefact use case model. 
2. Presenting the architecturally significant use cases of the system. 
3. Uses a set of scenarios and use cases that: Represents central functionality. Provide substantial architectural coverage. Stresses or illustrates a specific, delicate point of the architecture.
4. Each significant use case: Name, A brief description, Descriptions of the flow of events, Significant descriptions of relationships, Inventory of the significant use case diagrams, Significant descriptions of special requirements of the use case, and Significant pictures of the user interface.
5. Use case realization are found in logical view.

Logical View:
1. Subset of the design model.
2. Presents architecturally significant design elements.
3. Most important classes. Class organization in packages and subsystems. Organization of packages and subsystems into layers. Most important use case realizations. 
4. Describes the overall decomposition of the design model. Describes package hierarchy and layers. Puts most significant at the top level. Includes diagrams of significant top level packages, their interdependencies, and layering.
5. Each architecturally significant design package and class: Name and brief description, A diagram with all significant classes and packages, Major responsibilities/operations/attributes, and Important relationships. 
6. Use case realizations: Illustrates how the software works. Explains how the various design model elements contribute to their functionality. Represents some significant, central functionality of the final system.
7. Each significant use case realization: Name and brief description, Flow of events, Interaction or class diagrams, and Derived requirements.

Process View:
1. Describe the process structure of the system.
2. Presents all processes but only architecturally significant lightweight threads details.
3. Allows you to document key communication diagrams of interactions between processes.

Implementation View:
1. Captures the architectural decisions made for the implementation. An inventory of all subsystems in the implementation model. Component diagrams illustrating how subsystems are organized in layers and hierarchies. Illustrations of important dependencies between subsystems.
2. Assigning implementation work to individuals and teams or subcontractors. Assessing the amount of the code to be developed, modified, or deleted. Reasoning large scale reuse. Considering release strategies.
3. Decompose the software into layers and implementation subsystems.
4. Gives an overview of the allocation of design elements to the implementation.
5. Layers and implementation subsystems are described to: Related to logical or process view, and Identify architecturally significant building blocks.

Deployment View: 
1. Describe one or more physical network configurations on which the software is deployed and run.
2. Describe allocation of tasks to the physical nodes.
3. Uses deployment diagrams with configuration and mapping of processes to each processor.
4. Describes typical physical configuration and rules to map others.
5. Describes network configurations for software tests and simulations.

2014_10_07_p1
ADD: Architecture definition document is structured along the lines of TOGAF and aligns architecture views to architecture domains.
