import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String name;
	public int id;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String start_time;
	public String privacy;
	public String end_time;
	public String code_of_conduct;
	public String topic;
	public String location_name;
	public String timezone;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String logo;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String description;
	public String state;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String type;

	public RootModel(String background_image, String name, int id, String email, ArrayList<Social_linksModel> social_links, String organizer_description, String start_time, String privacy, String end_time, String code_of_conduct, String topic, String location_name, String timezone, CreatorModel creator, String schedule_published_on, String logo, String organizer_name, CopyrightModel copyright, String description, String state, VersionModel version, Call_for_papersModel call_for_papers, String type) {

		this.background_image = background_image;
		this.name = name;
		this.id = id;
		this.email = email;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.privacy = privacy;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.location_name = location_name;
		this.timezone = timezone;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.description = description;
		this.state = state;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.type = type;

	}

}