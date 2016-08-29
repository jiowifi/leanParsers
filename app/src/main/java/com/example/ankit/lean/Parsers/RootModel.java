import java.util.ArrayList;

class RootModel {

	public String location_name;
	public String type;
	public String schedule_published_on;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String description;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String topic;
	public String logo;
	public String timezone;
	public CreatorModel _creator;
	public String state;
	public String background_image;
	public String email;
	public String end_time;
	public int id;
	public String organizer_description;
	public String start_time;
	public String name;

	public RootModel(String location_name, String type, String schedule_published_on, String code_of_conduct, ArrayList<Social_linksModel> social_links, VersionModel version, Call_for_papersModel call_for_papers, String privacy, String description, CopyrightModel copyright, String organizer_name, String topic, String logo, String timezone, CreatorModel creator, String state, String background_image, String email, String end_time, int id, String organizer_description, String start_time, String name) {

		this.location_name = location_name;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.description = description;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.logo = logo;
		this.timezone = timezone;
		this._creator = creator;
		this.state = state;
		this.background_image = background_image;
		this.email = email;
		this.end_time = end_time;
		this.id = id;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.name = name;

	}

}