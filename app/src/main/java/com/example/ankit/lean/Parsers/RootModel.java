import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public String end_time;
	public String type;
	public int id;
	public String email;
	public CreatorModel _creator;
	public String state;
	public String organizer_name;
	public VersionModel _version;
	public String name;
	public String topic;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String background_image;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String schedule_published_on;
	public String description;
	public String timezone;
	public String organizer_description;
	public String privacy;

	public RootModel(ArrayList<Social_linksModel> social_links, String start_time, String end_time, String type, int id, String email, CreatorModel creator, String state, String organizer_name, VersionModel version, String name, String topic, String logo, Call_for_papersModel call_for_papers, String location_name, String background_image, CopyrightModel copyright, String code_of_conduct, String schedule_published_on, String description, String timezone, String organizer_description, String privacy) {

		this.social_links = social_links;
		this.start_time = start_time;
		this.end_time = end_time;
		this.type = type;
		this.id = id;
		this.email = email;
		this._creator = creator;
		this.state = state;
		this.organizer_name = organizer_name;
		this._version = version;
		this.name = name;
		this.topic = topic;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.background_image = background_image;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.privacy = privacy;

	}

}