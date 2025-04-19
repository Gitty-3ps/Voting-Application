package com.voting.votingapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.voting.votingapp.model.Poll;
import com.voting.votingapp.repositories.PollRepository;

@Service
public class PollService {

    private final PollRepository pollRepository;

    public PollService(PollRepository pollRepository) {
        this.pollRepository = pollRepository;
    }

    public Poll createPoll(Poll poll) {
        return pollRepository.save(poll);
    }

    public List<Poll> getAllPolls() {
        return pollRepository.findAll();
    }

    public Optional<Poll> getPollById(Long id) {
        return pollRepository.findById(id);
    }

    public void vote(Long pollId, int optionIndex) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'vote'");
    }

    // public void vote(Long pollId, int optionIndex) {
    //     Poll poll = poll
    // }
}
