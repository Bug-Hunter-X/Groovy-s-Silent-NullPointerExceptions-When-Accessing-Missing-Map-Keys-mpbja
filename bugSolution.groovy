```groovy
def myMethod(Map params) {
  // Safe navigation operator
  println params.missingParam?.toString() 
  
  // elvis operator
  println params.missingParam ?: "Default value"

  //containsKey method
  if(params.containsKey("missingParam")){
    println params.missingParam
  } else {
    println "Parameter not found"
  }
}

myMethod([name: "John"])
```