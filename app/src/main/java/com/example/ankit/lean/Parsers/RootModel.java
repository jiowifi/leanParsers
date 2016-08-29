import java.util.ArrayList;

class RootModel {

	public String name;
	public String organizer_description;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public String description;
	public String privacy;
	public String topic;
	public String state;
	public String end_time;
	public String email;
	public String start_time;
	public String background_image;
	public String location_name;
	public CreatorModel _creator;
	public VersionModel _version;
	public int id;
	public String timezone;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String type;

	public RootModel(String name, String organizer_description, String logo, ArrayList<Social_linksModel> social_links, String organizer_name, String description, String privacy, String topic, String state, String end_time, String email, String start_time, String background_image, String location_name, CreatorModel creator, VersionModel version, int id, String timezone, String code_of_conduct, CopyrightModel copyright, String schedule_published_on, Call_for_papersModel call_for_papers, String type) {

		this.name = name;
		this.organizer_description = organizer_description;
		this.logo = logo;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.description = description;
		this.privacy = privacy;
		this.topic = topic;
		this.state = state;
		this.end_time = end_time;
		this.email = email;
		this.start_time = start_time;
		this.background_image = background_image;
		this.location_name = location_name;
		this._creator = creator;
		this._version = version;
		this.id = id;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.type = type;

	}

}