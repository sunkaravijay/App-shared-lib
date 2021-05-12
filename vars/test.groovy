def test(Map config=[:], Closure body={}){
 echo config.command2
 echo 'Testing..'
 sh 'mvn'+' '+config.command2


}
