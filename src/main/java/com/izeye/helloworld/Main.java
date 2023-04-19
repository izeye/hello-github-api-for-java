package com.izeye.helloworld;

import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import java.io.IOException;

/**
 * Hello world for GitHub API for Java.
 *
 * @author Johnny Lim
 */
public class Main {
    public static void main(String[] args) throws IOException {
        GitHub github = GitHubBuilder.fromPropertyFile(".github").build();
        GHRepository repository = github.createRepository("test-github-api-for-java")
                .private_(true)
                .create();
        System.out.println(repository);
    }
}
