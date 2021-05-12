def test(Map config=[:], Closure body={}){
 echo config.command2
 echo 'Testing..'
 sh './mvnw'+' '+config.command2


}
