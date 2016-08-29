import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String state;
	public String timezone;
	public String end_time;
	public String type;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String organizer_name;
	public VersionModel _version;
	public String organizer_description;
	public String description;
	public String privacy;
	public String name;
	public String email;
	public String topic;
	public String logo;
	public String code_of_conduct;
	public int id;
	public String schedule_published_on;
	public String location_name;
	public String background_image;

	public RootModel(ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String start_time, String state, String timezone, String end_time, String type, CopyrightModel copyright, CreatorModel creator, String organizer_name, VersionModel version, String organizer_description, String description, String privacy, String name, String email, String topic, String logo, String code_of_conduct, int id, String schedule_published_on, String location_name, String background_image) {

		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.state = state;
		this.timezone = timezone;
		this.end_time = end_time;
		this.type = type;
		this._copyright = copyright;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this._version = version;
		this.organizer_description = organizer_description;
		this.description = description;
		this.privacy = privacy;
		this.name = name;
		this.email = email;
		this.topic = topic;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.background_image = background_image;

	}

}