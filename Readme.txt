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

* Java 8
* Eclipse Luna


Build & Test in Eclipse
=======================

Import all Java projects in Eclipse by File | Import | Existing Projects into Workspace (uncheck the Copy option).

To build the QVT engine in Eclipse just use standard eclipse build feature.

To run the QVT tests, select class QVTTestSuite in the Package Explorer and execute "Run As | JUnit Test" from the context menu.

To run the OCL tests, select class OclInterpreterTestSuite in the Package Explorer and execute "Run As | JUnit Test" from the context menu.
