package com.example.springredditclone.controller;

import com.example.springredditclone.dto.VoteDto;
import com.example.springredditclone.exception.PostNotFoundException;
import com.example.springredditclone.service.VoteService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/votes")
@AllArgsConstructor
public class VoteController {

    private final VoteService voteService;

    @PostMapping
    public ResponseEntity<Void> vote(@RequestBody VoteDto voteDto) throws PostNotFoundException {
        voteService.vote(voteDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
