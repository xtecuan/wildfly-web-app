import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

Path projectPath = Paths.get(request.outputDirectory, request.artifactId)
println("projectPath: "+projectPath)

Properties properties = request.properties

println("properties: "+properties)

String packageName = properties.get("package")

println("packageName: "+packageName)

String packagePath = packageName.replace(".", "/")

Files.deleteIfExists projectPath.resolve(request.artifactId+"-web/src/main/java/" + packagePath + "/org/primefaces/paradise/component/ParadiseMenu.java")
Files.deleteIfExists projectPath.resolve(request.artifactId+"-web/src/main/java/" + packagePath + "/org/primefaces/paradise/component/ParadiseMenuRenderer.java")
Files.deleteIfExists projectPath.resolve(request.artifactId+"-web/src/main/java/" + packagePath + "/org/primefaces/paradise/filter/CharacterEncodingFilter.java")
Files.deleteIfExists projectPath.resolve(request.artifactId+"-web/src/main/java/" + packagePath + "/org/primefaces/paradise/view/GuestPreferences.java")
Files.deleteIfExists projectPath.resolve(request.artifactId+"-web/src/main/java/" + packagePath + "/org/primefaces/paradise/component")
Files.deleteIfExists projectPath.resolve(request.artifactId+"-web/src/main/java/" + packagePath + "/org/primefaces/paradise/filter")
Files.deleteIfExists projectPath.resolve(request.artifactId+"-web/src/main/java/" + packagePath + "/org/primefaces/paradise/view")
Files.deleteIfExists projectPath.resolve(request.artifactId+"-web/src/main/java/" + packagePath + "/org/primefaces/paradise")
Files.deleteIfExists projectPath.resolve(request.artifactId+"-web/src/main/java/" + packagePath + "/org/primefaces")
Files.deleteIfExists projectPath.resolve(request.artifactId+"-web/src/main/java/" + packagePath + "/org")