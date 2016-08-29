import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String logo;
	public int id;
	public String timezone;
	public String type;
	public String start_time;
	public String privacy;
	public String email;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String state;
	public String name;
	public String organizer_name;
	public String description;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String topic;
	public String organizer_description;
	public VersionModel _version;
	public String background_image;

	public RootModel(ArrayList<Social_linksModel> social_links, String schedule_published_on, CreatorModel creator, String logo, int id, String timezone, String type, String start_time, String privacy, String email, String location_name, Call_for_papersModel call_for_papers, String end_time, String state, String name, String organizer_name, String description, CopyrightModel copyright, String code_of_conduct, String topic, String organizer_description, VersionModel version, String background_image) {

		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.logo = logo;
		this.id = id;
		this.timezone = timezone;
		this.type = type;
		this.start_time = start_time;
		this.privacy = privacy;
		this.email = email;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.state = state;
		this.name = name;
		this.organizer_name = organizer_name;
		this.description = description;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this._version = version;
		this.background_image = background_image;

	}

}