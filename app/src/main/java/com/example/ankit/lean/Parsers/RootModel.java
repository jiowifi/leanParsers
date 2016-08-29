import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String name;
	public String background_image;
	public String timezone;
	public String code_of_conduct;
	public String logo;
	public int id;
	public CreatorModel _creator;
	public String location_name;
	public String end_time;
	public String description;
	public String organizer_description;
	public VersionModel _version;
	public String start_time;
	public String state;
	public String type;
	public String privacy;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public String email;

	public RootModel(String organizer_name, Call_for_papersModel call_for_papers, String topic, String name, String background_image, String timezone, String code_of_conduct, String logo, int id, CreatorModel creator, String location_name, String end_time, String description, String organizer_description, VersionModel version, String start_time, String state, String type, String privacy, CopyrightModel copyright, String schedule_published_on, ArrayList<Social_linksModel> social_links, String email) {

		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.name = name;
		this.background_image = background_image;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.id = id;
		this._creator = creator;
		this.location_name = location_name;
		this.end_time = end_time;
		this.description = description;
		this.organizer_description = organizer_description;
		this._version = version;
		this.start_time = start_time;
		this.state = state;
		this.type = type;
		this.privacy = privacy;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.email = email;

	}

}