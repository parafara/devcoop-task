package feature.posting.service.dto.response;

import feature.posting.domain.Posting;

public record PostingResponseDto(
        Long id,
        String title,
        String content
) {

    public static PostingResponseDto from(Posting posting) {
        return new PostingResponseDto(
                posting.getId(),
                posting.getTitle(),
                posting.getContent()
        );
    }

}
