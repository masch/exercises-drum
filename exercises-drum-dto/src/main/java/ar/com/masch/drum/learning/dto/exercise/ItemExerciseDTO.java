package ar.com.masch.drum.learning.dto.exercise;

import org.apache.commons.lang3.builder.HashCodeBuilder;

public class ItemExerciseDTO {

	private static final int INITIAL_ODD_NUMBER_HAS_CODE = 17;
	private static final int MULTIPLIER_ODD_NUMBER_HAS_CODE = 31;

	private String name;
	private String index;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == null) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof ItemExerciseDTO)) {
			return false;
		}

		ItemExerciseDTO itemExerciseCompareDTO = (ItemExerciseDTO) obj;

		return ((this.getName().equals(itemExerciseCompareDTO.getName())) && (this
				.getIndex().equals(itemExerciseCompareDTO.getIndex())));
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(INITIAL_ODD_NUMBER_HAS_CODE,
				MULTIPLIER_ODD_NUMBER_HAS_CODE).
		// two randomly chosen prime numbers
		// if deriving: appendSuper(super.hashCode()).
				append(this.name).append(this.index).toHashCode();
	}
}
