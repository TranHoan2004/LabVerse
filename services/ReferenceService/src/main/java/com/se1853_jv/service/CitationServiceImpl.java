package com.se1853_jv.service;

import com.se1853_jv.dto.response.CitationResponse;
import com.se1853_jv.model.Citation;
import com.se1853_jv.repository.CitationRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Slf4j
@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CitationServiceImpl implements CitationService {
    CitationRepository repo;

    @Override
    public CitationResponse getCitationById(@NotNull String id) {
        log.info("getCitationById");
        var result = repo.findById(id);
        if (result.isPresent()) {
            var citation = result.get();
            log.info("citation: {}", citation);
            return new CitationResponse(
                    Objects.requireNonNull(citation.getId()), Objects.requireNonNull(citation.getAuthors()),
                    Objects.requireNonNull(citation.getTitle()), Objects.requireNonNull(citation.getJournal()),
                    citation.getYear(), Objects.requireNonNull(citation.getDoi())
            );
        }
        return null;
    }

    @Override
    @NotNull
    public CitationResponse getCitationByAuthors(@NotNull String authors) {
        return null;
    }

    @Override
    public @NotNull List<CitationResponse> getCitationsByJournal(@NotNull String journal) {
        return List.of();
    }

    @Override
    @NotNull
    public List<CitationResponse> getCitationsByYear(int year) {
        return List.of();
    }

    @Override
    public @NotNull CitationResponse getCitationByDoi(@NotNull String doi) {
        return null;
    }

    @Override
    public void createNewCitation(@NotNull Citation citation) {

    }

    @Override
    public void updateCitation(@NotNull Citation citation) {

    }

    @Override
    public void deleteCitationById(@NotNull String id) {

    }

    @Override
    public void deleteCitationsByYear(int year) {

    }
}
