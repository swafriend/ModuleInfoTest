module gradle.multi.project.app.main {
    // implementation project(':domain')
    requires gradle.multi.project.domain.main;
    requires spring.boot.autoconfigure;
    requires spring.boot;
}
// java　右クリック　新規　module-info.java