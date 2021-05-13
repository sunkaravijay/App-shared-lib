def test(Map config=[:], Closure body={}){
 echo config.command2
 echo 'Testing..'
 sh './mvnw'+' '+config.command2
 junit '**/target/checkstyle-checker.xml'
 junit '**/target/checkstyle-result.xml'
 junit '**/target/checkstyle-suppressions.xml'

}
