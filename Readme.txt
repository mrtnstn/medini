medini QVT Engine
=================

The medini QVT engine is an engine for model to model transformations. It implements OMG's QVT Relations standard. 

Features:

    * Execution of QVT transformations expressed in the textual concrete syntax of the Relations language
    * Editor with code assistant
    * Debugger to step through the relations
    * Trace management enabling incremental update during re-transformation
    * Key concept enabling incremental update as well as the transition from manual modeling to automation through transformations in the absence of traces
    * Bidirectional transformations 


Requirements
============

* Java 5
* Optional: Eclipse 3.3


Build & Test headless
=====================

Execute "build.bat -p" to see how to build the QVT engine headless and how to run the tests for QVT and OCL.


Build & Test in Eclipse
=======================

First you have to set up several classpath variables at Window | Preferences -> Java/Build Path/Classpath Variables :

EMF_COMMON = .\mediniOCLInterpreter\3rdParty\EMF\org.eclipse.emf.common_2.2.1.v200609210005.jar
EMF_ECORE_XMI = .\mediniOCLInterpreter\3rdParty\EMF\org.eclipse.emf.ecore.xmi_2.2.1.v200609210005.jar
EMF_ECORE = .\mediniOCLInterpreter\3rdParty\EMF\org.eclipse.emf.ecore_2.2.1.v200609210005.jar
EMF_EDIT = .\mediniQVTInterpreter\3rdParty\EMF\org.eclipse.emf.edit_2.2.1.v200609210005.jar
EMF_TRANSACTION = .\mediniQVTInterpreter\3rdParty\EMF\org.eclipse.emf.transaction_1.1.0.v200703301538.jar


Now, import all Java projects in Eclipse by File | Import | Existing Projects into Workspace (uncheck the Copy option).

To build the QVT engine in Eclipse, open the ANT view, drag QVTEMF/build.xml into it and double click on the "clean.distribute" task. qvtemf.jar is located in QVTEMF/dist.
Tip: Ant target "incremental.distribute" does not perform a clean-up and thus can be much faster by incremental building the Java sources.

To run the QVT tests, select class QVTTestSuite in the Package Explorer and execute "Run As | JUnit Test" from the context menu.

To run the OCL tests, select class OclInterpreterTestSuite in the Package Explorer and execute "Run As | JUnit Test" from the context menu.
