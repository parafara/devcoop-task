package feature.posting.service.interactor;

import feature.posting.service.dto.request.PostingCreateRequestDto;
import feature.posting.service.dto.response.PostingResponseDto;
import feature.posting.service.external.PostingRepositoryAdapter;
import feature.posting.service.internal.PostingCreatorAdapter;

public class PostingCreator implements PostingCreatorAdapter {
    private final PostingRepositoryAdapter repository;

    public PostingCreator(PostingRepositoryAdapter repository) {
        this.repository = repository;
    }

    @Override
    public PostingResponseDto create(PostingCreateRequestDto request) {
        return PostingResponseDto.from(repository.save(request.toPosting()));
    }
}
