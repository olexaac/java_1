package ru.stqa.pft.github;

import com.google.common.collect.ImmutableMap;
import com.jcabi.github.*;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by Админ on 12.04.2018.
 */
public class GithubTests {

  @Test
  public void testCommits() throws IOException {
    Github github = new RtGithub("f945363e76d89f3da77ed5ebd07e65ec3601ed2e");
    RepoCommits commits = github.repos().get(new Coordinates.Simple("olexaac", "java_1")).commits();
    for (RepoCommit commit : commits.iterate(new ImmutableMap.Builder<String, String>().build())) {

      System.out.println(new RepoCommit.Smart(commit).message());
    }
  }
}
