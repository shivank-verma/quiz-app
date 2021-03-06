package com.cheetahlabs.quiz.configuration;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.views.mustache.MustacheViewRenderer;
import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Collections;
import java.util.Map;

@Getter
@Setter
public class QuizConfiguration extends Configuration {
    private static final String DATABASE = "database";

    @Valid
    @NotNull
    @JsonProperty(DATABASE)
    private DataSourceFactory quizDb = new DataSourceFactory();

    @JsonProperty(DATABASE)
    public DataSourceFactory getQuizDb() {
        return quizDb;
    }

    private Map<String, Map<String, String>> viewRendererConfiguration = Collections.emptyMap();

    @JsonProperty("viewRendererConfiguration")
    public Map<String, Map<String, String>> getViewRendererConfiguration() {
        return viewRendererConfiguration;
    }

}
