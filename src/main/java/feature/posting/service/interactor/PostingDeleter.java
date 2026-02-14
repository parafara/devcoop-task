package feature.posting.service.interactor;

import feature.posting.service.dto.request.PostingDeleteRequestDto;
import feature.posting.service.external.PostingRepositoryAdapter;
import feature.posting.service.internal.PostingDeleterAdapter;

public class PostingDeleter implements PostingDeleterAdapter {
    private final PostingRepositoryAdapter repository;

    public PostingDeleter(PostingRepositoryAdapter repository) {
        this.repository = repository;
    }

    @Override
    public void delete(PostingDeleteRequestDto request) {
        repository.deleteById(request.id());
    }
}
