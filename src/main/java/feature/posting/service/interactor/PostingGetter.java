package feature.posting.service.interactor;

import feature.posting.service.dto.request.PostingGetRequestDto;
import feature.posting.service.dto.response.PostingResponseDto;
import feature.posting.service.external.PostingRepositoryAdapter;
import feature.posting.service.internal.PostingGetterAdapter;

public class PostingGetter implements PostingGetterAdapter {
    private final PostingRepositoryAdapter repository;

    public PostingGetter(PostingRepositoryAdapter repository) {
        this.repository = repository;
    }

    @Override
    public PostingResponseDto get(PostingGetRequestDto request) {
        return PostingResponseDto.from(repository.getById(request.id()));
    }
}
