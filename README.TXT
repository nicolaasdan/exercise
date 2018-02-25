Write a function that provides change directory (cd) function for an abstract file system

notes:

- Root path is '/'
- Path seperator is '/'
- Parent direcotry is addressable as ".."
- Directory names consist only of English alphabet letters (A-Z and a-z)
- The function should support both relative and absolute paths
- The function will not be passed any invalid paths
- Do not use built-in path-related functions

For example:
Path path = new Path("a/b/c/d");

path.cd("../x");

console.WriteLine(path.CurrentPath);

should display 'a/b/c/x'
