The examples in this Eclipse project are based on the Shapes metamodel.
The metamodel and the GMF editors where contributed by the Telematica Instituut. Within the scope of a QVT workshop, 
members of ikv and the Telematica Instituut developed the here-in contained QVT transformations.


The metamodel is contained in folder "metamodel", however within the mediniQVT cockpit, 
it is advised to use the generated EMF plugins of this metamodel.
To do so, add "urn:Shapes.ecore" in the QVT preferences (it is listed at "New | Browse Registered Packages").

The transformations in the folders qvt/Rule* are mostly based on the copy transformation in "qvt/copy", 
which simply copies a shapes model. In "qvt/OMGissues", some problems with the QVT standard are demonstrated.
