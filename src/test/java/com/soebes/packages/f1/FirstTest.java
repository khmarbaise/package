package com.soebes.packages.f1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FirstTest {

  @Test
  void firstTest() {
    assertThat(new First("First")).isNotNull();
  }
}
