/*
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.optaplanner.workbench.screens.guidedrule.model;

import java.util.Collection;

import org.jboss.errai.common.client.api.annotations.Portable;

@Portable
public final class ScoreInformation {

    private Collection<String> scoreHolderFqnTypeFqns;

    private Collection<BendableScoreLevelsWrapper> bendableScoreLevelsWrappers;

    public ScoreInformation() {
    }

    public ScoreInformation(final Collection<String> scoreHolderFqnTypeFqns,
                            final Collection<BendableScoreLevelsWrapper> bendableScoreLevelsWrappers) {
        this.scoreHolderFqnTypeFqns = scoreHolderFqnTypeFqns;
        this.bendableScoreLevelsWrappers = bendableScoreLevelsWrappers;
    }

    public Collection<String> getScoreHolderFqnTypeFqns() {
        return scoreHolderFqnTypeFqns;
    }

    public Collection<BendableScoreLevelsWrapper> getBendableScoreLevelsWrappers() {
        return bendableScoreLevelsWrappers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ScoreInformation that = (ScoreInformation) o;

        if (scoreHolderFqnTypeFqns != null ? !scoreHolderFqnTypeFqns.equals(that.scoreHolderFqnTypeFqns) : that.scoreHolderFqnTypeFqns != null) {
            return false;
        }
        return bendableScoreLevelsWrappers != null ? bendableScoreLevelsWrappers.equals(that.bendableScoreLevelsWrappers) : that.bendableScoreLevelsWrappers == null;
    }

    @Override
    public int hashCode() {
        int result = scoreHolderFqnTypeFqns != null ? scoreHolderFqnTypeFqns.hashCode() : 0;
        result = ~~result;
        result = 31 * result + (bendableScoreLevelsWrappers != null ? bendableScoreLevelsWrappers.hashCode() : 0);
        result = ~~result;
        return result;
    }
}