supercollider_programs
======================

Musical tools written using the SuperCollider language

These are notes to help me remember worthwhile insights:
* Variables are global if not inside some other scope. Globals have to be declared with ~ at the beginning. Single lower case letters are globals by default and don't need a ~. This is why you get an error if you try to assign to "aa" at the top level but not when you assign to "a", for example.
