package feature.posting.service.interactor;

import feature.posting.service.dto.request.PostingUpdateRequestDto;
import feature.posting.service.dto.response.PostingResponseDto;
import feature.posting.service.external.PostingRepositoryAdapter;
import feature.posting.service.internal.PostingUpdaterAdapter;

public class PostingUpdater implements PostingUpdaterAdapter {
    private final PostingRepositoryAdapter repository;

    public PostingUpdater(PostingRepositoryAdapter repository) {
        this.repository = repository;
    }

    @Override
    public PostingResponseDto update(PostingUpdateRequestDto request) {
        return PostingResponseDto.from(repository.update(request.toPosting()));
    }
}
