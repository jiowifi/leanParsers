import java.util.ArrayList;

class RootModel {

	public String topic;
	public String background_image;
	public String end_time;
	public String organizer_description;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String timezone;
	public String code_of_conduct;
	public String location_name;
	public String email;
	public int id;
	public CreatorModel _creator;
	public String type;
	public CopyrightModel _copyright;
	public String name;
	public String logo;
	public String privacy;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public String schedule_published_on;
	public VersionModel _version;

	public RootModel(String topic, String background_image, String end_time, String organizer_description, String description, Call_for_papersModel call_for_papers, String organizer_name, String timezone, String code_of_conduct, String location_name, String email, int id, CreatorModel creator, String type, CopyrightModel copyright, String name, String logo, String privacy, String start_time, ArrayList<Social_linksModel> social_links, String state, String schedule_published_on, VersionModel version) {

		this.topic = topic;
		this.background_image = background_image;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this.email = email;
		this.id = id;
		this._creator = creator;
		this.type = type;
		this._copyright = copyright;
		this.name = name;
		this.logo = logo;
		this.privacy = privacy;
		this.start_time = start_time;
		this.social_links = social_links;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this._version = version;

	}

}