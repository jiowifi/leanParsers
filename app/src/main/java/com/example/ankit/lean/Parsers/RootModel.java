import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String description;
	public VersionModel _version;
	public String code_of_conduct;
	public String type;
	public String start_time;
	public String organizer_name;
	public String email;
	public String location_name;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String name;
	public String organizer_description;
	public String background_image;
	public String schedule_published_on;
	public String topic;
	public String timezone;
	public int id;
	public CopyrightModel _copyright;
	public String state;
	public String privacy;

	public RootModel(Call_for_papersModel call_for_papers, String logo, String description, VersionModel version, String code_of_conduct, String type, String start_time, String organizer_name, String email, String location_name, CreatorModel creator, ArrayList<Social_linksModel> social_links, String end_time, String name, String organizer_description, String background_image, String schedule_published_on, String topic, String timezone, int id, CopyrightModel copyright, String state, String privacy) {

		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.description = description;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.email = email;
		this.location_name = location_name;
		this._creator = creator;
		this.social_links = social_links;
		this.end_time = end_time;
		this.name = name;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.timezone = timezone;
		this.id = id;
		this._copyright = copyright;
		this.state = state;
		this.privacy = privacy;

	}

}