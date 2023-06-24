module gradle.multi.project.domain.main {
    requires lombok;
    requires spring.boot.autoconfigure;
    requires spring.boot;
    exports com.example.domain;
}