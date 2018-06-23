package com.no502zhang.file.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/files")
class FileController {

    @GetMapping("/")
    fun list(): ResponseEntity<String> {
        return ResponseEntity.ok("ok")
    }

    @GetMapping("/{id}")
    fun get(): ResponseEntity<String> {
        return ResponseEntity.ok("ok")
    }

    @PostMapping("/")
    fun add(): ResponseEntity<String> {
        return ResponseEntity.ok("ok")
    }

    @PutMapping("/{id}")
    fun update(): ResponseEntity<String> {
        return ResponseEntity.ok("ok")
    }

    @DeleteMapping("/{id}")
    fun delete(): ResponseEntity<String> {
        return ResponseEntity.ok("ok")
    }
}