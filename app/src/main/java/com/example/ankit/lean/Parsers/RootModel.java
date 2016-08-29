import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String location_name;
	public String organizer_description;
	public String state;
	public int id;
	public CreatorModel _creator;
	public String topic;
	public String email;
	public String background_image;
	public String privacy;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String timezone;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String start_time;
	public String type;
	public String end_time;
	public String code_of_conduct;
	public String description;

	public RootModel(ArrayList<Social_linksModel> social_links, String name, String location_name, String organizer_description, String state, int id, CreatorModel creator, String topic, String email, String background_image, String privacy, String schedule_published_on, CopyrightModel copyright, String organizer_name, String timezone, String logo, Call_for_papersModel call_for_papers, VersionModel version, String start_time, String type, String end_time, String code_of_conduct, String description) {

		this.social_links = social_links;
		this.name = name;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.state = state;
		this.id = id;
		this._creator = creator;
		this.topic = topic;
		this.email = email;
		this.background_image = background_image;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.start_time = start_time;
		this.type = type;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.description = description;

	}

}