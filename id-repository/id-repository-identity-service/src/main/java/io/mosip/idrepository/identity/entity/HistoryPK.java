package io.mosip.idrepository.identity.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The Class HistoryPK - Composite key for History tables.
 *
 * @author Manoj SP
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HistoryPK implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -1124172782509039861L;

	private String uinRefId;

	/** The effective date time. */
	private LocalDateTime effectiveDateTime;

}
