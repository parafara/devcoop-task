package feature.posting.service.interactor;

import feature.posting.domain.Posting;
import feature.posting.service.dto.request.PostingListGetRequestDto;
import feature.posting.service.dto.response.PostingResponseDto;
import feature.posting.service.external.PostingRepositoryAdapter;
import feature.posting.service.internal.PostingListGetterAdapter;

import java.util.ArrayList;
import java.util.List;

public class PostingListGetter implements PostingListGetterAdapter {
    private final PostingRepositoryAdapter repository;

    public PostingListGetter(PostingRepositoryAdapter repository) {
        this.repository = repository;
    }

    @Override
    public List<PostingResponseDto> getList(PostingListGetRequestDto request) {
        List<Posting> postings = repository.getList(request.page(), request.pageSize());
        List<PostingResponseDto> response = new ArrayList<>();

        for (Posting posting : postings) response.add(PostingResponseDto.from(posting));

        return response;
    }
}
