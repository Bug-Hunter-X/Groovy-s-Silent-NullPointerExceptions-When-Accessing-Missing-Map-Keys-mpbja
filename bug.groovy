```groovy
def myMethod(Map params) {
  // Accessing a parameter that might not exist
  println params.missingParam
}

myMethod([name: "John"])
```