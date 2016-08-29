import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String description;
	public String name;
	public String organizer_description;
	public int id;
	public String timezone;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public CreatorModel _creator;
	public String code_of_conduct;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String organizer_name;
	public String end_time;
	public String state;
	public String schedule_published_on;
	public String logo;
	public String type;
	public String background_image;
	public String privacy;
	public String topic;

	public RootModel(ArrayList<Social_linksModel> social_links, String email, String description, String name, String organizer_description, int id, String timezone, CopyrightModel copyright, VersionModel version, CreatorModel creator, String code_of_conduct, String location_name, Call_for_papersModel call_for_papers, String start_time, String organizer_name, String end_time, String state, String schedule_published_on, String logo, String type, String background_image, String privacy, String topic) {

		this.social_links = social_links;
		this.email = email;
		this.description = description;
		this.name = name;
		this.organizer_description = organizer_description;
		this.id = id;
		this.timezone = timezone;
		this._copyright = copyright;
		this._version = version;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.type = type;
		this.background_image = background_image;
		this.privacy = privacy;
		this.topic = topic;

	}

}