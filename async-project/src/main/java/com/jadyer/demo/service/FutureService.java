package com.jadyer.demo.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

public interface FutureService {

    Future<String> send1();

    Future<String> send2();
}
