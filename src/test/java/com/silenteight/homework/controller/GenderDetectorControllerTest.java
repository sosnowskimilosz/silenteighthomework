package com.silenteight.homework.controller;

import com.silenteight.homework.service.NamesDisplayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class GenderDetectorControllerTest {

    @MockBean
    private NamesDisplayerService namesDisplayerService;

    @Autowired
    private MockMvc mockMvc;


}
