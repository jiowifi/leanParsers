import java.util.ArrayList;

class RootModel {

	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public CreatorModel _creator;
	public String email;
	public String start_time;
	public int id;
	public String timezone;
	public String topic;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String end_time;
	public String description;
	public String location_name;
	public String code_of_conduct;
	public String schedule_published_on;
	public String type;
	public String background_image;
	public String state;
	public String name;

	public RootModel(String logo, Call_for_papersModel call_for_papers, String organizer_name, CreatorModel creator, String email, String start_time, int id, String timezone, String topic, String privacy, ArrayList<Social_linksModel> social_links, VersionModel version, CopyrightModel copyright, String organizer_description, String end_time, String description, String location_name, String code_of_conduct, String schedule_published_on, String type, String background_image, String state, String name) {

		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.email = email;
		this.start_time = start_time;
		this.id = id;
		this.timezone = timezone;
		this.topic = topic;
		this.privacy = privacy;
		this.social_links = social_links;
		this._version = version;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.description = description;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.background_image = background_image;
		this.state = state;
		this.name = name;

	}

}