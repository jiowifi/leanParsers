import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String location_name;
	public String state;
	public String start_time;
	public String privacy;
	public int id;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public String organizer_description;
	public VersionModel _version;
	public String organizer_name;
	public String description;
	public String timezone;
	public String end_time;
	public String code_of_conduct;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String logo;
	public String topic;
	public String type;
	public CopyrightModel _copyright;

	public RootModel(CreatorModel creator, String location_name, String state, String start_time, String privacy, int id, String name, Call_for_papersModel call_for_papers, String email, String organizer_description, VersionModel version, String organizer_name, String description, String timezone, String end_time, String code_of_conduct, String background_image, ArrayList<Social_linksModel> social_links, String schedule_published_on, String logo, String topic, String type, CopyrightModel copyright) {

		this._creator = creator;
		this.location_name = location_name;
		this.state = state;
		this.start_time = start_time;
		this.privacy = privacy;
		this.id = id;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.organizer_description = organizer_description;
		this._version = version;
		this.organizer_name = organizer_name;
		this.description = description;
		this.timezone = timezone;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.topic = topic;
		this.type = type;
		this._copyright = copyright;

	}

}