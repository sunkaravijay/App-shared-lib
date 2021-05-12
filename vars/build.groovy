
def check(Map config=[:], Closure body={}){
 echo config.command1
 sh './mvnw'+' '+config.command1


}
