
def check(Map config=[:], Closure body={}){
 echo config.command1
 sh 'mvn'+' '+config.command1


}
