import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public String schedule_published_on;
	public String timezone;
	public String logo;
	public String background_image;
	public int id;
	public String start_time;
	public String topic;
	public String privacy;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String state;
	public String organizer_name;
	public CreatorModel _creator;
	public String type;
	public String name;
	public String organizer_description;
	public String code_of_conduct;
	public String description;
	public String end_time;
	public String email;

	public RootModel(ArrayList<Social_linksModel> social_links, String location_name, String schedule_published_on, String timezone, String logo, String background_image, int id, String start_time, String topic, String privacy, VersionModel version, Call_for_papersModel call_for_papers, CopyrightModel copyright, String state, String organizer_name, CreatorModel creator, String type, String name, String organizer_description, String code_of_conduct, String description, String end_time, String email) {

		this.social_links = social_links;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.logo = logo;
		this.background_image = background_image;
		this.id = id;
		this.start_time = start_time;
		this.topic = topic;
		this.privacy = privacy;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.state = state;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.type = type;
		this.name = name;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.end_time = end_time;
		this.email = email;

	}

}