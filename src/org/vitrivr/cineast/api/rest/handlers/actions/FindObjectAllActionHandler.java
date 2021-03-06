package org.vitrivr.cineast.api.rest.handlers.actions;

import java.util.List;
import java.util.Map;

import org.vitrivr.cineast.api.rest.handlers.abstracts.ParsingActionHandler;
import org.vitrivr.cineast.core.data.entities.MultimediaObjectDescriptor;
import org.vitrivr.cineast.core.data.messages.general.AnyMessage;
import org.vitrivr.cineast.core.data.messages.result.ObjectQueryResult;
import org.vitrivr.cineast.core.db.dao.reader.MultimediaObjectLookup;

/**
 * @author rgasser
 * @version 1.0
 * @created 10.01.17
 */
public class FindObjectAllActionHandler extends ParsingActionHandler<AnyMessage> {
  @Override
  public ObjectQueryResult invoke(AnyMessage type, Map<String, String> parameters) {

    MultimediaObjectLookup ol = new MultimediaObjectLookup();
    List<MultimediaObjectDescriptor> multimediaobjectIds = ol.getAllObjects();
    ol.close();
    return new ObjectQueryResult("", multimediaobjectIds);
  }

  @Override
  public Class<AnyMessage> inClass() {
    return AnyMessage.class;
  }
}
