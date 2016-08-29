import java.util.ArrayList;

class RootModel {

	public String timezone;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String organizer_description;
	public String location_name;
	public String topic;
	public int id;
	public String end_time;
	public String background_image;
	public String email;
	public String code_of_conduct;
	public VersionModel _version;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public CopyrightModel _copyright;
	public String name;
	public String organizer_name;
	public String state;
	public String type;
	public String start_time;

	public RootModel(String timezone, String description, Call_for_papersModel call_for_papers, CreatorModel creator, String schedule_published_on, String organizer_description, String location_name, String topic, int id, String end_time, String background_image, String email, String code_of_conduct, VersionModel version, String privacy, ArrayList<Social_linksModel> social_links, String logo, CopyrightModel copyright, String name, String organizer_name, String state, String type, String start_time) {

		this.timezone = timezone;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.topic = topic;
		this.id = id;
		this.end_time = end_time;
		this.background_image = background_image;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.privacy = privacy;
		this.social_links = social_links;
		this.logo = logo;
		this._copyright = copyright;
		this.name = name;
		this.organizer_name = organizer_name;
		this.state = state;
		this.type = type;
		this.start_time = start_time;

	}

}