package com.example.jsonparsejava.app;

import com.example.jsonparsejava.TestingConsts;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

class ApplicationTest {

    @Test
    void parseJson() throws IOException {
        Application.parseJson();
    }

    @Test
    void getVersion() throws IOException {
        assertThat(Application.getVersion()).isEqualTo(TestingConsts.EXPECTED_VERSION);
    }
}