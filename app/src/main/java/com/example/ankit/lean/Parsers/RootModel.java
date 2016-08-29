import java.util.ArrayList;

class RootModel {

	public String state;
	public String organizer_description;
	public String type;
	public String start_time;
	public String privacy;
	public VersionModel _version;
	public String logo;
	public String topic;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String name;
	public String end_time;
	public String location_name;
	public String code_of_conduct;
	public String timezone;
	public String organizer_name;
	public String email;
	public String background_image;
	public String description;

	public RootModel(String state, String organizer_description, String type, String start_time, String privacy, VersionModel version, String logo, String topic, int id, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String schedule_published_on, CopyrightModel copyright, CreatorModel creator, String name, String end_time, String location_name, String code_of_conduct, String timezone, String organizer_name, String email, String background_image, String description) {

		this.state = state;
		this.organizer_description = organizer_description;
		this.type = type;
		this.start_time = start_time;
		this.privacy = privacy;
		this._version = version;
		this.logo = logo;
		this.topic = topic;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this._creator = creator;
		this.name = name;
		this.end_time = end_time;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.email = email;
		this.background_image = background_image;
		this.description = description;

	}

}